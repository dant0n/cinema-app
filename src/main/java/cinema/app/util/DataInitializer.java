package cinema.app.util;

import cinema.app.model.Role;
import cinema.app.model.RoleName;
import cinema.app.model.User;
import cinema.app.service.AuthenticationService;
import cinema.app.service.RoleService;
import cinema.app.service.UserService;
import java.util.Set;
import javax.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer {
    private final RoleService roleService;
    private final UserService userService;
    private final AuthenticationService authenticationService;

    public DataInitializer(RoleService roleService,
                           UserService userService,
                           AuthenticationService authenticationService) {
        this.roleService = roleService;
        this.userService = userService;
        this.authenticationService = authenticationService;
    }

    @PostConstruct
    public void inject() {
        Role adminRole = new Role();
        adminRole.setRoleName(RoleName.ROLE_ADMIN);
        roleService.add(adminRole);
        Role userRole = new Role();
        userRole.setRoleName(RoleName.ROLE_USER);
        roleService.add(userRole);

        User user = new User();
        user.setEmail("bob@mail.com");
        user.setPassword("1234");
        user.setRoles(Set.of(roleService.getByName("role_admin")));
        userService.add(user);

        authenticationService.register("alice@mail.com", "1234");
    }
}
