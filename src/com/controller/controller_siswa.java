/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.controller;
import com.view.mahasiswa;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author LENOVO
 */
public interface controller_siswa {
    public void Simpan(mahasiswa siswa) throws SQLException;
    public void Ubah(mahasiswa siswa) throws SQLException;
    public void Hapus(mahasiswa siswa) throws SQLException;
    public void Tampil(mahasiswa siswa) throws SQLException;
    public void Baru(mahasiswa siswa) throws SQLException;
    public void KlikTabel(mahasiswa siswa) throws SQLException;
}
