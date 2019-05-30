package app.controllers;

import app.dtos.PromptMsgDto;
import app.dtos.TsubDTO;
import app.services.TsubService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api/tsub")
public class TsubController {

    @Autowired
    private TsubService tsubService;

    @GetMapping(value = "")
    public PromptMsgDto getAllTsub() {
        return tsubService.getAllTsub();
    }

    @PostMapping(value = "")
    public PromptMsgDto addTsub(@RequestBody TsubDTO tsubDTO) {
        return tsubService.addTsub(tsubDTO);
    }

    @PostMapping(value = "/update")
    public PromptMsgDto updateSub(@RequestBody TsubDTO tsubDTO){
        return tsubService.updateSub(tsubDTO);
    }

    @PostMapping(value = "/delete")
    public PromptMsgDto deleteTsub(@RequestBody TsubDTO tsubDTO) {
        return tsubService.deleteTsub(tsubDTO);
    }
}
