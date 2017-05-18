package com.oblador.keychain.exceptions;

public class KeyStoreAccessException extends Exception {
    public KeyStoreAccessException(Throwable t) {
        super(t);
    }

    public KeyStoreAccessException(String message, Throwable t) {
        super(message, t);
    }
}
