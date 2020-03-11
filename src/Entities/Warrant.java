/******************************************************************************
 * File Name: Warrant.java                                                    *
 * Initial Version                                                            *
 ******************************************************************************
 * Warrant object instantiated when a driver commits a crime, from officer    *
 * (c) 2020 Uncanny-Varsett Traffic Citation                                  *
 ******************************************************************************
 * Created By: Matt Ferlaino                                                  *
 * Date:       Mar 11th 2020                                                  *
 ******************************************************************************/

// Packages
package Entities;

// Imports
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Warrant {
    private Integer offenseId;
    private String description;

    @Id
    @Column(name = "offense_id")
    public Integer getOffenseId() {
        return offenseId;
    }

    public void setOffenseId(Integer offenseId) {
        this.offenseId = offenseId;
    }

    @Basic
    @Column(name = "description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Warrant warrant = (Warrant) o;
        return Objects.equals(offenseId, warrant.offenseId) &&
                Objects.equals(description, warrant.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(offenseId, description);
    }
}
