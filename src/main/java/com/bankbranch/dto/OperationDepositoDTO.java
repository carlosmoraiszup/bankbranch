package com.bankbranch.dto;

import com.bankbranch.domain.Operation;
import com.bankbranch.domain.enums.OperationType;

public class OperationDepositoDTO {


    private Integer idDestinationAccount;
    private Double value;
    private String typeOperation;
    private String dateOperation;

    public OperationDepositoDTO(){}

    public OperationDepositoDTO(Operation operation){
        this.idDestinationAccount = operation.getNumberDestinationAccount();
        this.value = operation.getValue();
        this.typeOperation = OperationType.toEnum(1).getDescription();
        this.dateOperation = operation.getDateOperation();
    }


    public Integer getIdDestinationAccount() {
        return idDestinationAccount;
    }

    public void setIdDestinationAccount(Integer idDestinationAccount) {
        this.idDestinationAccount = idDestinationAccount;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public String getTypeOperation() {
        return typeOperation;
    }

    public void setTypeOperation(String typeOperation) {
        this.typeOperation = typeOperation;
    }

    public String getDateOperation() {
        return dateOperation;
    }

    public void setDateOperation(String dateOperation) {
        this.dateOperation = dateOperation;
    }




}
