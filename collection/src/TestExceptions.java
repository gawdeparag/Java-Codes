public class TestExceptions {
    public static void main(String[] args) {
//        try {
//            throw new CustomUncheckedException("This is a Custom Unchecked Exception within try-catch");
//        } catch (CustomUncheckedException e) {
//            System.out.println(e.getMessage());
//        }
        try {
            throw new CustomCheckException("This is a Custom Checked Exception");
        } catch (CustomCheckException e) {
            System.out.println(e.getMessage());
        }

//        throw new CustomCheckException("This is a Custom Checked Exception outside try-catch");

//        throw new CustomUncheckedException("This is a Custom Unchecked Exception");
    }
}
