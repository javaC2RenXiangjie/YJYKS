package app.controllers;

import app.dtos.PromptMsgDto;
import app.dtos.TrInfoDTO;
import app.services.TrInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.net.PortUnreachableException;

@RestController
@RequestMapping(path = "api/trinfo")
public class TrInfoController {

    @Autowired
    private TrInfoService trInfoService;

    @PostMapping(value = "/update")
    public PromptMsgDto updateTr(@RequestBody TrInfoDTO trInfoDTO){
        return trInfoService.updateTr(trInfoDTO);
    }

    @GetMapping(value = "")
    public PromptMsgDto getAllTr() {
        return trInfoService.getAllTr();
    }

    @PostMapping(value = "/delete")
    public PromptMsgDto deleteTr(@RequestBody TrInfoDTO trInfoDTO){
        return trInfoService.deleteTr(trInfoDTO);
    }

    @PostMapping(value = "/")
    public PromptMsgDto addTr(@RequestBody TrInfoDTO trInfoDTO){
        return trInfoService.addTr(trInfoDTO);
    }
}
