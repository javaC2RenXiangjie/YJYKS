package app.services.servicesImpl;

import app.converts.TrInfoConvert;
import app.dtos.PromptMsgDto;
import app.dtos.TrInfoDTO;
import app.entities.TrInfoEntity;
import app.repos.TrInfoRepo;
import app.services.TrInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TrInfoServiceImpl implements TrInfoService{

    @Autowired
    private TrInfoRepo trInfoRepo;

    @Autowired
    private TrInfoConvert trInfoConvert;

    @Override
    public PromptMsgDto getAllTr() {
        PromptMsgDto promptMsgDto = new PromptMsgDto();
        List<TrInfoDTO> trInfoDTOS = new ArrayList<>();
        try{
            for(TrInfoEntity trInfoEntity: trInfoRepo.getAllTr()) {
                trInfoDTOS.add(trInfoConvert.TrInfoEntitoDTO(trInfoEntity));
            }
            promptMsgDto.setCode(2);
            promptMsgDto.setMsgContent("查找成功！");
            promptMsgDto.setOb(trInfoDTOS);
            return promptMsgDto;
        }catch(Exception e){
            promptMsgDto.setCode(4);
            promptMsgDto.setMsgContent(e.toString());
            return promptMsgDto;
        }
    }

    @Override
    public PromptMsgDto updateTr(TrInfoDTO trInfoDTO) {
        PromptMsgDto promptMsgDto = new PromptMsgDto();
        try{
            trInfoRepo.save(trInfoConvert.TrInfoEntitoEntity(trInfoDTO));
            promptMsgDto.setCode(2);
            promptMsgDto.setMsgContent("更新成功！");
            return promptMsgDto;
        }catch(Exception e){
            promptMsgDto.setCode(4);
            promptMsgDto.setMsgContent(e.toString());
            return promptMsgDto;
        }
    }

    @Override
    public PromptMsgDto deleteTr(TrInfoDTO trInfoDTO) {
        PromptMsgDto promptMsgDto = new PromptMsgDto();
        try{
            trInfoRepo.delete(trInfoConvert.TrInfoEntitoEntity(trInfoDTO));
            promptMsgDto.setCode(2);
            promptMsgDto.setMsgContent("删除成功！");
            return promptMsgDto;
        }catch(Exception e){
            promptMsgDto.setCode(4);
            promptMsgDto.setMsgContent(e.toString());
            return promptMsgDto;
        }
    }

    @Override
    public PromptMsgDto addTr(TrInfoDTO trInfoDTO) {
        PromptMsgDto promptMsgDto = new PromptMsgDto();
        try{
            trInfoRepo.save(trInfoConvert.TrInfoEntitoEntity(trInfoDTO));
            promptMsgDto.setCode(2);
            promptMsgDto.setMsgContent("添加成功！");
            return promptMsgDto;
        }catch(Exception e){
            promptMsgDto.setCode(4);
            promptMsgDto.setMsgContent(e.toString());
            return promptMsgDto;
        }
    }


}
