package util;

import exception.UserExpectedError;
import exception.WrongFieldException;
import exception.WrongSumException;

public class ClientFieldsValidation {
    public static void validateAccountIdSize(String accountId) throws WrongFieldException {
        if (accountId.length() != 10) {
            throw new WrongFieldException();
        }
    }

    public static void validateSum(double sum) throws WrongSumException {
        if (sum > 1000) {
            throw new WrongSumException();
        }
    }

    public static void validateSenderOrRecipient(String sender, String recipient) {
        if (!sender.equals(recipient)) {
            throw new UserExpectedError();
        }

    }
}

