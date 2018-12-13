package javaca.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javaca.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	@Query("SELECT a FROM User a WHERE a.userrole=3")
	List<User> showallstudent();

	@Query("SELECT a FROM User a WHERE a.userrole=2")
	List<User> showalllectures();

	@Query("SELECT a FROM User a WHERE a.userrole=:uid")
	User findOne(@Param("uid") String uid);

	// @Query("SELECT u FROM User as u WHERE u.userRole.roleID =3:urid")
	// List<User> findStudent(@Param("urid") int urid);
	@Query("SELECT u FROM User as u WHERE u.userID =:urid")
	User findOne(@Param("urid") int urid);

}
