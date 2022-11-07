package baseball;

public class UserInputException {
    public UserInputException() {
    }

    // 입력받은 자릿수가 세자리가 아니라면 false 리턴
    private boolean checkIfInputIsThreeDigit(String inputString) {
        return inputString.length() == 3;
    }

    // 입력받은 값이 정수가 아니라면 false 리턴
    private boolean checkInputIsInteger(String inputString) {
        try {
            Integer.parseInt(inputString);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }
}
