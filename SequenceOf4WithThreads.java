class NumbersGenerator {
    int number = 1;
    int numberOfThreads;
    int totalNumbersInSequence;

    public NumbersGenerator(int numberOfThreads, int totalNumbersInSequence) {
        super();
        this.numberOfThreads = numberOfThreads;
        this.totalNumbersInSequence = totalNumbersInSequence;
    }

    public void printNumbers(int result) {
        synchronized (this) {
            while (number < totalNumbersInSequence-1) {
                while (number % numberOfThreads != result) {
                    try {
                        wait();
                    }
                    catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(Thread.currentThread().getName() + " " + number++);
                notifyAll();
            }
        }
    }
}

class SequenceGeneratorTask implements Runnable {
    private NumbersGenerator numbersGenerator;
    private int result;

    public SequenceGeneratorTask(NumbersGenerator numbersGenerator, int result) {
        super();
        this.numbersGenerator = numbersGenerator;
        this.result = result;
    }

    @Override
    public void run() {
        numbersGenerator.printNumbers(result);
    }
}
public class SequenceOf4WithThreads {
    private static final int TOTAL_NUMBERS_IN_SEQUENCE = 12;
    private static final int TOTAL_NUMBER_OF_THREADS = 4;

    public static void main(String[] args) {
        NumbersGenerator numbersGenerator = new NumbersGenerator(TOTAL_NUMBER_OF_THREADS, TOTAL_NUMBERS_IN_SEQUENCE);

        Thread threadOne = new Thread(new SequenceGeneratorTask(numbersGenerator, 1), "Thread-1");
        Thread threadTwo = new Thread(new SequenceGeneratorTask(numbersGenerator, 2), "Thread-2");
        Thread threadThree = new Thread(new SequenceGeneratorTask(numbersGenerator, 3), "Thread-3");
        Thread threadFour = new Thread(new SequenceGeneratorTask(numbersGenerator, 0), "Thread-4");

        threadOne.start();
        threadTwo.start();
        threadThree.start();
        threadFour.start();
    }
}
