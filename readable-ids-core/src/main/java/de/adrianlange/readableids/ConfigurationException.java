package de.adrianlange.readableids;

public class ConfigurationException extends RuntimeException {

  public ConfigurationException(String message) {

    super(message);
  }

  public ConfigurationException(String message, Throwable throwable) {

    super(message, throwable);
  }
}
