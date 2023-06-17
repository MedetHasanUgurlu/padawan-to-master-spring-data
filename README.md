# MASTERING SPRING DATA

* **JPA**: facilitate orm to manage relational data in java application. ıt provıdes platform to work directly with an object instead of using SQL statements.\
  **_Jpa Implementation_**: _hibernate, eclipselink, toplınk, mybatis._
* Spring Data Jpa uses EntityManager and TypedQuery

Repository <---------->    EntityManager

flush()     ------>     flush()

save(S)     ------>     persist(), merge()

delete(T)   ------>     remove(), merge(), contains()

findOne(ID) ------>     find()

* Spring Data JPA ---> JPA ---> HIBERNATE(JDBC) ----> DB

## Generation Type
**GenerationType.AUTO** = our default persistence provider which using hibernate, it selects based on database specific dialect. \
**GenerationType.IDENTITY**= +1

<div align="center">
<img src="img.png">
</div>

![img_2.png](img_2.png)


### JPA METHODS
#### save
> **S save(S entity)** \
Saving entity can be performed using save from CrudRepository.\
It persist or merge.\
If entity has not been persisted Spring Data JPA call entityManager.persist() otherwise call entityManager.merge().