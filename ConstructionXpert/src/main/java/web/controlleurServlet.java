package web;

import dao.IProjet;
import dao.IProjetImpl;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import metier.Project;

import java.io.IOException;
import java.util.List;

public class  controlleurServlet extends HttpServlet {
    private IProjet metier;

    @Override
    public void init() throws ServletException {
        metier = new IProjetImpl();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // Handle GET requests if needed
        processRequest(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // Handle POST requests if needed
        processRequest(req, resp);
    }

    private void processRequest(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String path = req.getServletPath();
        switch (path) {
            case "/home":
                IProjetImpl model = new IProjetImpl();
                List<Project> projects = model.afficherProject();
                req.setAttribute("model", projects);
                req.getRequestDispatcher("/WEB-INF/Project.jsp").forward(req, resp);
                break;
            case "/AjouterForm":
                req.getRequestDispatcher("/WEB-INF/Project.jsp").forward(req, resp);
                break;
            case "/Ajouter":
                String nom = req.getParameter("nom");
                String description = req.getParameter("description");

                int ajouter = new Project(nom,description);
                metier.saveProject(ajouter);
                resp.sendRedirect(req.getContextPath() + "/home");
                break;
            default:
                resp.sendError(HttpServletResponse.SC_NOT_FOUND, "Page not found");
                break;
        }
    }
}
