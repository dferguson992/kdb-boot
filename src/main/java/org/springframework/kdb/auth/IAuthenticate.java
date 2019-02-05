package org.springframework.kdb.auth;

/**
 * {@code IAuthenticate} describes interface to authenticate incoming connection based on authentication string
 */
public interface IAuthenticate {
    /**
     * Checks authentication string provided to allow/reject connection.
     *
     * @param s String containing username:password for authentication
     * @return true if credentials accepted.
     * @see <a href="https://code.kx.com/q/ref/dotz/#zpw-validate-user">.z.pw</a>
     */
    boolean authenticate(String s);
}
