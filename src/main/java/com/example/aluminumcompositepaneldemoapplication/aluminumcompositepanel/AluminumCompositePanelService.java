package com.example.aluminumcompositepaneldemoapplication.aluminumcompositepanel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AluminumCompositePanelService {

    private AluminumCompositePanelRepository aluminumCompositePanelRepository;

    @Autowired
    public AluminumCompositePanelService(AluminumCompositePanelRepository aluminumCompositePanelRepository) {
        this.aluminumCompositePanelRepository = aluminumCompositePanelRepository;
    }

    public List<AluminumCompositePanel> getPanels() {
        return aluminumCompositePanelRepository.findAll();
    }
}
