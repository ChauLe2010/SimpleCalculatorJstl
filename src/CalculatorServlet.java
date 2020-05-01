import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CalculatorServlet",urlPatterns = "/calculate")
public class CalculatorServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        float firstNumber=Float.parseFloat(request.getParameter("firstNumber"));
        float secondNumber=Float.parseFloat(request.getParameter("secondNumber"));
        String operator=request.getParameter("operator");
        PrintWriter printWriter=response.getWriter();
        printWriter.println("<html>");

        try{
            float result=Calculator.calculate(firstNumber,secondNumber,operator);
            printWriter.println(firstNumber + " " + operator + " " + secondNumber + " = " + result);

        }catch (RuntimeException ex){
            printWriter.println(ex.getMessage());
        }
        printWriter.println("</html>");

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
