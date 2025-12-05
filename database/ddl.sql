USE hotel_db;

CREATE TABLE reservations (
      id BIGINT NOT NULL AUTO_INCREMENT,
      check_in_date DATE NOT NULL ,
      check_out_date DATE NOT NULL ,
      guest_name NVARCHAR(255) NOT NULL ,
      guest_email NVARCHAR(255) NOT NULL ,
      room_number INT NOT NULL ,

      PRIMARY KEY (id)
);
