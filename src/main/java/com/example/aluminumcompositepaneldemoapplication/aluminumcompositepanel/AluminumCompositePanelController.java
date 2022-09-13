package com.example.aluminumcompositepaneldemoapplication.aluminumcompositepanel;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/panel")
public class AluminumCompositePanelController {

    private AluminumCompositePanelService aluminumCompositePanelService;

    @GetMapping
    private List<AluminumCompositePanel> getPanels(AluminumCompositePanelService aluminumCompositePanelService) {
        return aluminumCompositePanelService.getPanels();
    }
}
