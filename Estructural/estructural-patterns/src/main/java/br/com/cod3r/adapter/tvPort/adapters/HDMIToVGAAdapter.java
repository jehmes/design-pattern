package br.com.cod3r.adapter.tvPort.adapters;

import br.com.cod3r.adapter.tvPort.devices.OldMonitor;
import br.com.cod3r.adapter.tvPort.intefaces.HDMI;
import br.com.cod3r.adapter.tvPort.intefaces.VGA;

public class HDMIToVGAAdapter implements HDMI {

    private VGA vga;

    public HDMIToVGAAdapter(OldMonitor oldMonitor) {
        this.vga = oldMonitor;
    }
    @Override
    public void setImage(String image) {
        vga.setImage(image);
    }

    @Override
    public void setSound(String sound) {
        System.out.println("We dont work with sounds =/");
    }
}
