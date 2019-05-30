package app.converts;

import app.dtos.EquipDTO;
import app.entities.EquipEntity;
import org.springframework.stereotype.Service;

@Service
public class EquipConvert {
    public EquipDTO EquipEntityToDto(EquipEntity equipEntity){
        EquipDTO equipDTO = new EquipDTO();
        equipDTO.setId(equipEntity.getId());
        equipDTO.setStore(equipEntity.getStore());
        equipDTO.setAddtime(equipEntity.getAddtime());
        equipDTO.setInstruction(equipEntity.getInstruction());
        equipDTO.setStatus(equipEntity.getStatus());
        return equipDTO;
    }

    public EquipEntity EquipDtoToEntity(EquipDTO equipDTO){
        EquipEntity equipEntity = new EquipEntity();
        equipEntity.setId(equipDTO.getId());
        equipEntity.setStore(equipDTO.getStore());
        equipEntity.setAddtime(equipDTO.getAddtime());
        equipEntity.setInstruction(equipDTO.getInstruction());
        equipEntity.setStatus(equipDTO.getStatus());
        return equipEntity;
    }
}
