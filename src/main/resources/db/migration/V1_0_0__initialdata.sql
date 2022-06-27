create table DichVu
(
   DV_ID                int not null,
   DV_Ten               varchar(255),
   primary key (DV_ID)
);

/*==============================================================*/
/* Table: DonVi                                                 */
/*==============================================================*/
create table DonVi
(
   DV_ID                int not null,
   DV_Ten               varchar(255),
   DV_DiaChi            varchar(225),
   DV_SDT               numeric(10,0),
   DV_Email             varchar(50),
   primary key (DV_ID)
);
insert into donvi
values(1,'Co so 1A', '208a, Phuong1, TP.My Tho', '0234762865','coso1@gmail.com');
/*==============================================================*/
/* Table: Goi_Tin                                               */
/*==============================================================*/
create table Goi_Tin
(
   GT_ID                int not null,
   LYC_Ma               int not null,
   DV_ID                int not null,
   GT_NoiDung           varchar(225),
   GT_TrangThai         varchar(50),
   primary key (GT_ID)
);

/*==============================================================*/
/* Table: Goi_Tin_Gui                                           */
/*==============================================================*/
create table Goi_Tin_Gui
(
   GTG_ID               int not null,
   GT_ID                int not null,
   DV_ID                int not null,
   GTG_NoiGui           varchar(225),
   GTG_NgayGui          date,
   GTG_NgayHT           date,
   primary key (GTG_ID)
);

/*==============================================================*/
/* Table: Goi_Tin_Nhan                                          */
/*==============================================================*/
create table Goi_Tin_Nhan
(
   GTN_ID               int not null,
   GT_ID                int not null,
   DV_ID                int not null,
   GTN_NoiNhan          varchar(225),
   GTN_NgayNhan         date,
   primary key (GTN_ID)
);

/*==============================================================*/
/* Table: HoatDong                                              */
/*==============================================================*/
create table HoatDong
(
   HD_ID                int not null,
   User_ID              int not null,
   DV_ID                int not null,
   HD_Ten               varchar(255),
   primary key (HD_ID)
);

/*==============================================================*/
/* Table: Loai_Yeu_Cau                                          */
/*==============================================================*/
create table Loai_Yeu_Cau
(
   LYC_Ma               int not null,
   LYC_Ten              varchar(50),
   primary key (LYC_Ma)
);

/*==============================================================*/
/* Table: Rules                                                 */
/*==============================================================*/
create table Rules
(
   Rules_ID             int not null,
   DV_ID                int,
   primary key (Rules_ID)
);

/*==============================================================*/
/* Table: TaiKHoan                                              */
/*==============================================================*/
-- flyway_schema_history
create table TaiKHoan
(
   tk_ma                int not null,
   user_id              int not null,
   username              varchar(50),
   password          varchar(50),
   primary key (TK_Ma)
);

insert into taikhoan
values(101,111,'tran123','wsxedc');

/*==============================================================*/
/* Table: User                                                  */
/*==============================================================*/
create table User
(
   User_ID              int not null,
   DV_ID                int not null,
   HoTen                varchar(50),
   DiaChi               varchar(225),
   SoDienThoai          numeric(10,0),
   Email                varchar(50),
   primary key (User_ID)
);
insert into user(user_id,dv_id,hoten,diachi,sodienthoai, email)
values(111,1, 'Tran Tran', 'Tp.My Tho', '0987654321','tran123@gmail.com');

/*==============================================================*/
/* Table: User_Dichvu                                           */
/*==============================================================*/
create table User_Dichvu
(
   User_ID              int not null,
   DV_ID                int not null,
   primary key (User_ID, DV_ID)
);

alter table Goi_Tin add constraint FK_Loai_goitin foreign key (LYC_Ma)
      references Loai_Yeu_Cau (LYC_Ma) on delete restrict on update restrict;

alter table Goi_Tin add constraint FK_Relationship_11 foreign key (DV_ID)
      references DonVi (DV_ID) on delete restrict on update restrict;

alter table Goi_Tin_Gui add constraint FK_Relationship_4 foreign key (DV_ID)
      references DonVi (DV_ID) on delete restrict on update restrict;

alter table Goi_Tin_Gui add constraint FK_gui foreign key (GT_ID)
      references Goi_Tin (GT_ID) on delete restrict on update restrict;

alter table Goi_Tin_Nhan add constraint FK_Relationship_5 foreign key (DV_ID)
      references DonVi (DV_ID) on delete restrict on update restrict;

alter table Goi_Tin_Nhan add constraint FK_nhan foreign key (GT_ID)
      references Goi_Tin (GT_ID) on delete restrict on update restrict;

alter table HoatDong add constraint FK_Dichvu_Hoatdong foreign key (DV_ID)
      references DichVu (DV_ID) on delete restrict on update restrict;

alter table HoatDong add constraint FK_User_Hoatdong foreign key (User_ID)
      references User (User_ID) on delete restrict on update restrict;

alter table Rules add constraint FK_Dichvu_Rules foreign key (DV_ID)
      references DichVu (DV_ID) on delete restrict on update restrict;

alter table TaiKHoan add constraint FK_taikhoan_user foreign key (User_ID)
      references User (User_ID) on delete restrict on update restrict;

alter table User add constraint FK_Thuoc_donvi foreign key (DV_ID)
      references DonVi (DV_ID) on delete restrict on update restrict;

alter table User_Dichvu add constraint FK_User_Dichvu foreign key (User_ID)
      references User (User_ID) on delete restrict on update restrict;

alter table User_Dichvu add constraint FK_User_Dichvu2 foreign key (DV_ID)
      references DichVu (DV_ID) on delete restrict on update restrict;