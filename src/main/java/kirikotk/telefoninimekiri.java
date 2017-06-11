package kirikotk;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "telefonid")
public class telefoninimekiri{
    @Id
    public String title;
    public int year;
	public int cost;
}

/*

CREATE TABLE telefonid(
	id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
	title VARCHAR(50),
	year INT,
	cost INT
);

INSERT INTO telefonid VALUES ('','Samsung S7 Edge 32GB', '2016', '579');
INSERT INTO telefonid VALUES ('','iPhone 7 32GB', '2016', '739');
INSERT INTO telefonid VALUES ('','iPhone SE 16GB', '2016', '379');

mysql -uif16 -pifikad16 if16_kirikotk_4
*/