package app.services;

import app.dtos.EquipDTO;
import app.dtos.PromptMsgDto;

import java.util.List;

public interface EquipService {

    PromptMsgDto getAllEquip();

    PromptMsgDto deleteSub( EquipDTO equipDTO);

    PromptMsgDto updateSub( EquipDTO equipDTO);

    PromptMsgDto addEquip( EquipDTO equipDTO);
}
