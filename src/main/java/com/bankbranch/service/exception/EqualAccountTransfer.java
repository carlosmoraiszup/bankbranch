package com.bankbranch.service.exception;

public class EqualAccountTransfer extends RuntimeException {

    public EqualAccountTransfer(String msg) {
        super(msg);
    }

}