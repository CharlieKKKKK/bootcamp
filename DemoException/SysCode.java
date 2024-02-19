package DemoException;

public enum SysCode {

  SERVER_TIMEOUT(1, "Server Connrction Time out."),
  
  DB_TIMEOUT(1001, "Date")
  
  
  
  ;

  private String message;
  private int code;

  private SysCode(String message, int code) {
    this.code = code;
    this.message = message;
  }

  public String getMessage() {
    return this.message;
  }

  public int getCode() {
    return this.code;
  }

}
