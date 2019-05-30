package app.services;

import app.dtos.PromptMsgDto;
import app.dtos.TsubDTO;

public interface TsubService {

    PromptMsgDto getAllTsub();

    PromptMsgDto updateSub(TsubDTO tsubDTO);

    public PromptMsgDto deleteTsub(TsubDTO tsubDTO);

    PromptMsgDto addTsub(TsubDTO tsubDTO);
}
