package hellojpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JpaMain {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        tx.begin();
        try {
//          필드와 컬럼 매핑
            Member member = new Member();
            member.setId(1L);
            member.setUsername("AAA");
            member.setRoleType(RoleType.USER);

            Member member1 = new Member();
            member1.setId(2L);
            member1.setUsername("BBB");
            member1.setRoleType(RoleType.ADMIN);

            Member member2 = new Member();
            member2.setId(3L);
            member2.setUsername("CCC");
            member2.setRoleType(RoleType.ADMIN);

            em.persist(member);
            em.persist(member1);
            em.persist(member2);






            tx.commit();
        } catch (Exception e){
            tx.rollback();
        } finally {
            em.close();
        }
        emf.close();

















    }
}
