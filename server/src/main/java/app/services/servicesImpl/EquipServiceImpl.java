package app.services.servicesImpl;

import app.controllers.EquipController;
import app.converts.EquipConvert;
import app.dtos.EquipDTO;
import app.dtos.PromptMsgDto;
import app.entities.EquipEntity;
import app.repos.EquipRepo;
import app.services.EquipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class EquipServiceImpl implements EquipService{

    @Autowired
    private EquipRepo equipRepo;

    @Autowired
    private EquipConvert equipConvert;

    @Override
    public PromptMsgDto getAllEquip() {
        PromptMsgDto promptMsgDto = new PromptMsgDto();
        List<EquipDTO> equipDTOS = new ArrayList<>();
        try {
            for(EquipEntity equipEntity: equipRepo.getAllEquipment()){
                equipDTOS.add(equipConvert.EquipEntityToDto(equipEntity));
            }
            promptMsgDto.setCode(2);
            promptMsgDto.setMsgContent("读取成功");
            promptMsgDto.setOb(equipDTOS);
        } catch ( Exception e) {
            promptMsgDto.setCode(4);
            promptMsgDto.setMsgContent(e.toString());
        }
        return promptMsgDto;
    }

    @Override
    public PromptMsgDto deleteSub(EquipDTO equipDTO) {
        PromptMsgDto promptMsgDto = new PromptMsgDto();
        try {
            equipRepo.delete(equipConvert.EquipDtoToEntity(equipDTO));

            promptMsgDto.setCode(2);
            promptMsgDto.setMsgContent("删除成功！");
            return promptMsgDto;
        }catch (Exception e) {
            promptMsgDto.setCode(4);
            promptMsgDto.setMsgContent(e.toString());
            return promptMsgDto;
        }
    }

    @Override
    public PromptMsgDto updateSub(EquipDTO equipDTO) {
        PromptMsgDto promptMsgDto = new PromptMsgDto();
        try {
            equipRepo.save(equipConvert.EquipDtoToEntity(equipDTO));

            promptMsgDto.setCode(2);
            promptMsgDto.setMsgContent("更新成功！");
            return promptMsgDto;
        }catch (Exception e) {
            promptMsgDto.setCode(4);
            promptMsgDto.setMsgContent(e.toString());
            return promptMsgDto;
        }
    }

    @Override
    public PromptMsgDto addEquip(EquipDTO equipDTO) {
        PromptMsgDto promptMsgDto = new PromptMsgDto();
        equipDTO.setAddtime(new Date());
        try {
            equipRepo.save(equipConvert.EquipDtoToEntity(equipDTO));

            promptMsgDto.setCode(2);
            promptMsgDto.setMsgContent("添加成功！");
            return promptMsgDto;
        }catch (Exception e) {
            promptMsgDto.setCode(4);
            promptMsgDto.setMsgContent(e.toString());
            return promptMsgDto;
        }
    }
}
