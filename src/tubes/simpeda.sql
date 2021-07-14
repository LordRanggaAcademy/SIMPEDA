create database simpeda;
use simpeda;
CREATE TABLE pengajuan_laporan(
    nik varchar(20) primary key not null,
    nama varchar(80),
    rt varchar(5),
    rw varchar(5),
    jenis_kelamin varchar(20),
    nomer_telefon varchar(20),
    kategori_laporan varchar(40),
    tanggal_laporan date,
    isi_laporan varchar(2000),
    status_validasi varchar(20)
);

CREATE TABLE pengajuan_ktp(
nik varchar(20) primary key not null,
nama varchar(80),
alamat varchar(80),
rt_rw varchar(10),
desa varchar(30),
kecamatan varchar(30),
kabupaten varchar(30),
warga varchar(30),
tempat_tanggal_lahir varchar(30),
pekerjaan varchar(30),
status varchar(30),
jenis_kelamin varchar(20),
no_telp varchar(12),
status_validasi varchar(20)
);

#describe pengajuan_laporan;
#describe pengajuan_ktp;

#drop table pengajuan_laporan;
#drop table pengajuan_ktp;

#select * from pengajuan_laporan;
#select * from pengajuan_ktp;

#select nik, nama, alamat, rt_rw, desa, kecamatan, kabupaten, warga, tempat_tanggal_lahir, pekerjaan, status, jenis_kelamin, no_telp from pengajuan_ktp where status_validasi = "Belum Divalidasi";

#update pengajuan_ktp set status_validasi = "DIVALIDASI" where nik = "4324432432432";