package app.services.servicesImpl;

import app.converts.TsubConvert;
import app.dtos.PromptMsgDto;
import app.dtos.TsubDTO;
import app.entities.TsubEntity;
import app.repos.TsubRepo;
import app.services.TsubService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class TsubServiceImpl implements TsubService{

    @Autowired
    private TsubRepo tsubRepo;

    @Autowired
    private TsubConvert tsubConvert;

    @Override
    public PromptMsgDto getAllTsub() {
        PromptMsgDto promptMsgDto = new PromptMsgDto();
        List<TsubDTO> tsubDtos = new ArrayList<>();
        for(TsubEntity tsubEntity:tsubRepo.getAllTsub()){
            tsubDtos.add(tsubConvert.tsubEntityConvertToDTO(tsubEntity));
        }
        promptMsgDto.setCode(2);
        promptMsgDto.setMsgContent("请求成功");
        promptMsgDto.setOb(tsubDtos);
        return promptMsgDto;
    }

    @Override
    public PromptMsgDto updateSub(TsubDTO tsubDTO) {
        PromptMsgDto promptMsgDto = new PromptMsgDto();
        try {
            tsubRepo.save(tsubConvert.tsubDTOConvertToEntity(tsubDTO));
        }catch (Exception e){
            e.printStackTrace();
            promptMsgDto.setCode(4);
            promptMsgDto.setMsgContent("更新失败，请检查控制台！");
            return promptMsgDto;
        }
        promptMsgDto.setCode(2);
        promptMsgDto.setMsgContent("修改成功！");
        return promptMsgDto;
    }

    @Override
    public PromptMsgDto deleteTsub(TsubDTO tsubDTO) {
        PromptMsgDto promptMsgDto = new PromptMsgDto();
        tsubRepo.delete(tsubConvert.tsubDTOConvertToEntity(tsubDTO));
        promptMsgDto.setCode(2);
        promptMsgDto.setMsgContent("删除成功！");
        return promptMsgDto;
    }

    @Override
    public PromptMsgDto addTsub(TsubDTO tsubDTO) {
        PromptMsgDto promptMsgDto = new PromptMsgDto();
        tsubDTO.setAddTime(new Date());
        try {
            tsubRepo.save(tsubConvert.tsubDTOConvertToEntity(tsubDTO));
            promptMsgDto.setMsgContent("项目添加成功");
            promptMsgDto.setCode(2);
            return promptMsgDto;
        }catch (Exception e){
            promptMsgDto.setMsgContent(e.toString());
            promptMsgDto.setCode(4);
            return promptMsgDto;
        }
    }


}
