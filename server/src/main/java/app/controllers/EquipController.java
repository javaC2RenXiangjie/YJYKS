package app.controllers;

import app.dtos.EquipDTO;
import app.dtos.PromptMsgDto;
import app.services.EquipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.rmi.PortableRemoteObject;
import java.net.PortUnreachableException;


@RestController
@RequestMapping(path = "/api/equip")
public class EquipController {

    @Autowired
    private EquipService equipService;

    @GetMapping(value = "")
    public PromptMsgDto getAllEquip(){
        return equipService.getAllEquip();
    }

    @PostMapping(value = "/delete")
    public PromptMsgDto deleteSub(@RequestBody EquipDTO equipDTO) {
        return equipService.deleteSub(equipDTO);
    }

    @PostMapping(value = "/update")
    public PromptMsgDto updateSub(@RequestBody EquipDTO equipDTO) {
        return equipService.updateSub(equipDTO);
    }

    @PostMapping(value = "")
    public PromptMsgDto addEquip(@RequestBody EquipDTO equipDTO){
        return equipService.addEquip(equipDTO);
    }
}
