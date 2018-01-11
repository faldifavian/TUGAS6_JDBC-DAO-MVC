/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.faldifavian.latihanmvcjdbc.event;

import edu.faldifavian.latihanmvcjdbc.entity.Pelanggan;
import edu.faldifavian.latihanmvcjdbc.model.PelangganModel;

/**
 *
 * @author faldi
 * NIM      : 10116493
 * NAMA     : Faldi Favian
 * KELAS    : PBO11
 */
public interface PelangganListener {

    public void onChange(PelangganModel model);

    public void onInsert(Pelanggan pelanggan);

    public void onDelete();

    public void onUpdate(Pelanggan pelanggan);

}
