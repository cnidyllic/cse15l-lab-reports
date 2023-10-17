import java.io.IOException;
import java.net.URI;

class Handler implements URLHandler {
  String str = "";
  int numseq = 1;
  public String handleRequest(URI url) {
    if (url.getPath().equals("/")) {
        return String.format("\nNum: %d", numseq++);
    } else if (url.getPath().equals("/add-message") {
        String[] requests = url.getQuery().split("s=");
        str = requests[1];
        return String.format("\nNum: %d + \s", numseq++, str);
    } else {
        return 
      
  
      
      
