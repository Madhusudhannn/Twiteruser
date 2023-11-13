package TwiterTask.TwiterTask;


import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;

import java.util.Collection;

public class CustomAuthentication implements Authentication {
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        // Return authorities if needed.
        return null;
    }

    @Override
    public Object getCredentials() {
        return null;
    }

    @Override
    public Object getDetails() {
        return null;
    }

    @Override
    public Object getPrincipal() {
        return null;
    }

    @Override
    public boolean isAuthenticated() {
        return true;
    }

    @Override
    public void setAuthenticated(boolean isAuthenticated) throws IllegalArgumentException {
        // Custom logic to set authentication status.
    }

    @Override
    public String getName() {
        return null;
    }
}

