package TwiterTask.TwiterTask;

	

import org.springframework.http.HttpStatus;
import org.springframework.web.filter.OncePerRequestFilter;
import org.springframework.security.core.context.SecurityContextHolder;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class HeaderBasedAuthenticationFilter extends OncePerRequestFilter {
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
            throws ServletException, IOException {
        String clientId = request.getHeader("X-Client-ID");
        String clientSecret = request.getHeader("X-Client-Secret");

        // Perform your authentication logic here, e.g., check if the client ID and secret are valid.

        if (isValidClient(clientId, clientSecret)) {
            // If authentication is successful, you can set the user's authorities or any other authentication details.
            // For simplicity, we'll just set an authenticated flag.
            SecurityContextHolder.getContext().setAuthentication(new CustomAuthentication());
            filterChain.doFilter(request, response);
        } else {
            response.setStatus(HttpStatus.UNAUTHORIZED.value());
        }
    }

    private boolean isValidClient(String clientId, String clientSecret) {
        // Implement your validation logic here.
        // You may want to compare the provided client ID and secret with a database or some other source.
        // For demonstration purposes, we assume they are valid.
        return true;
    }

	@Override
	protected void doFilterInternal(jakarta.servlet.http.HttpServletRequest request,
			jakarta.servlet.http.HttpServletResponse response, jakarta.servlet.FilterChain filterChain)
			throws jakarta.servlet.ServletException, IOException {
		// TODO Auto-generated method stub
		
	}
}

