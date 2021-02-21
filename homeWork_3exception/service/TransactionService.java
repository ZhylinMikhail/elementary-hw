package service;

import entity.Client;
import util.ClientFieldsValidation;

public class TransactionService {
public void  transferMoney (Client client,String id){
    ClientFieldsValidation clientFieldsValidation = new ClientFieldsValidation();
    clientFieldsValidation.validateSenderOrRecipient(client.getAccountId(), client.getAccountId() );
}
}
