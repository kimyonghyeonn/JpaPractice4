package hellojpa;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

@Entity //JPA 관리 대상으로 인식한다
public class Member {
   @Id
    private Long id;

   @Column(name = "name", nullable = false) //컬럼 매핑
    private String username;

   private Integer age;

//   enum타입에 ORDINAL은 위험함 => 이전에 삽입된 enum형태의 컬럼이 최신화가 되지 않기 때문
   @Enumerated(EnumType.STRING) //enum타입 매핑, STRING: enum 이름을 DB에 저장 / ORDINAL: enum순서를 DB에 저장
    private  RoleType roleType;

   @Temporal(TemporalType.TIMESTAMP) //날짜 타입 매핑
    private Date createDate;

   @Temporal(TemporalType.TIMESTAMP)
    private Date lastModifiedDate;

   @Lob //BLOB, CLOB(varchar보다 더 큰 문자를 넣고 싶을때)
    private String description;

   @Transient //특정 필드를 컬럼으로 넣지 않는다
   private int temp;

   private LocalDate testLocalDate;
   private LocalDateTime testLocalDateTime;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public RoleType getRoleType() {
        return roleType;
    }

    public void setRoleType(RoleType roleType) {
        this.roleType = roleType;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }

    public Member() {
    }
}
