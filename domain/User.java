package com.onlinefurniture.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "user1")
public class User {


    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    long uId;
    @NotEmpty
    @Size(min = 3, max = 50,message = "username size")
    String username;
    @NotEmpty
    @Size(min = 3, max = 15,message = "password size")
    String password;
    @NotEmpty
    @Size(min = 3, max = 50,message = "fName size")
    String fName;
    @NotEmpty
    @Size(min = 3, max = 50,message = "lName size")
    String lName;
    @Email
    String email;


    @OneToOne(cascade = CascadeType.ALL)
    Phone phone;

    @ManyToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    @JoinTable(name="USER_ROLES",joinColumns =
            {@JoinColumn(name="USER_ID")},inverseJoinColumns = {
            @JoinColumn(name="ROLE_ID")})
    /*@ToStringExclude
    @JsonIgnore*/
    private Set<Role> roles = new HashSet<>();

    private String image;

    public void addRole(Role role){
        roles.add(role);
    }

	public long getuId() {
		return uId;
	}

	public void setuId(long uId) {
		this.uId = uId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Phone getPhone() {
		return phone;
	}

	public void setPhone(Phone phone) {
		this.phone = phone;
	}

	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}







}
