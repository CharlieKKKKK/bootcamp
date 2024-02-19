package DemoException;

public class BusinessException extends Exception {

  private int code;

  public BusinessException(SysCode sysCode) {
    this(sysCode.getMessage(), sysCode.getCode());
  }

  private BusinessException(String message, int code) {
    super(message);
    this.code = code;
  }
}
