@WebServlet("/user")
public class UserServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Fetch user data and forward to JSP
        request.setAttribute("user", new User("John Doe", "john@example.com"));
        request.getRequestDispatcher("/WEB-INF/userProfile.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Handle user registration
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        request.setAttribute("message", "User registered successfully!");
        request.getRequestDispatcher("/WEB-INF/registration.jsp").forward(request, response);
    }
}
