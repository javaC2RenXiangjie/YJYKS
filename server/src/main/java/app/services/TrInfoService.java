package app.services;

import app.dtos.PromptMsgDto;
import app.dtos.TrInfoDTO;

public interface TrInfoService {
    PromptMsgDto getAllTr();

    PromptMsgDto updateTr( TrInfoDTO trInfoDTO);

    PromptMsgDto deleteTr( TrInfoDTO trInfoDTO);

    PromptMsgDto addTr( TrInfoDTO trInfoDTO);
}
