package com.example.aluminumcompositepaneldemoapplication.aluminumcompositepanel;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AluminumCompositePanelRepository extends JpaRepository<AluminumCompositePanel, String> {
}
