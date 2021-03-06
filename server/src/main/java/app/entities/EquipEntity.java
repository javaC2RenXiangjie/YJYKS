package app.entities;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "equip")
public class EquipEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private int id;
    private String store;
    private Date addtime;
    private String status;
    private String instruction;

    @Override
    public String toString() {
        return "EquipEntity{" +
                "id=" + id +
                ", store='" + store + '\'' +
                ", addtime=" + addtime +
                ", status='" + status + '\'' +
                ", instruction='" + instruction + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStore() {
        return store;
    }

    public void setStore(String store) {
        this.store = store;
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getInstruction() {
        return instruction;
    }

    public void setInstruction(String instruction) {
        this.instruction = instruction;
    }
}
