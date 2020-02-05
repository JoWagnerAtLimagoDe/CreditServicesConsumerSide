use zeiterfassung;

INSERT IGNORE INTO tblzeitmodelle SET id = '5c88d4c5-4c8a-45f6-85f0-170ff4112427', bezeichnung='Standard'; 
INSERT IGNORE INTO tblzeitmodelle SET id = '5c88d4c5-4c8a-45f6-85f0-170ff4112401', bezeichnung='Standard-1'; 
INSERT IGNORE INTO tblzeitmodelle SET id = '5c88d4c5-4c8a-45f6-85f0-170ff4112402', bezeichnung='Standard-2'; 
INSERT IGNORE INTO tblzeitmodelle SET id = '5c88d4c5-4c8a-45f6-85f0-170ff4112403', bezeichnung='Standard-3'; 
INSERT IGNORE INTO tblzeitmodelle SET id = '5c88d4c5-4c8a-45f6-85f0-170ff4112404', bezeichnung='Standard-4'; 
INSERT IGNORE INTO tblzeitmodelle SET id = '5c88d4c5-4c8a-45f6-85f0-170ff4112405', bezeichnung='Standard-5'; 
INSERT IGNORE INTO tblzeitmodelle SET id = '5c88d4c5-4c8a-45f6-85f0-170ff4112406', bezeichnung='Standard-6'; 
INSERT IGNORE INTO tblzeitmodelle SET id = '5c88d4c5-4c8a-45f6-85f0-170ff4112407', bezeichnung='Standard-6'; 
INSERT IGNORE INTO tblzeitmodelle SET id = '5c88d4c5-4c8a-45f6-85f0-170ff4112408', bezeichnung='Standard-7'; 


INSERT IGNORE INTO `tblmitarbeiter` 
	SET `username` = 'limago', 
	`fullname` = 'Hersteller', 
	hersteller=TRUE,
	password = '$2a$10$VyNSiMVB5s8M2MEOm1Mh/el8NW3mPM3UX81trnjgTVGdDrqbpq8Qq', 
	`enabled`=TRUE,
	`beginn_arbeitverhaeltnis` = '1900-01-01',
	`ende_arbeitverhaeltnis`= '2500-01-01',
	`last_update` = CURDATE(),
	`version` = 0;
INSERT IGNORE INTO `tblmitarbeiter` 
	SET `username` = 'peterhinz', 
	`fullname` = 'Peter Hinz', 
	hersteller=FALSE,
	password = '$2a$10$VyNSiMVB5s8M2MEOm1Mh/el8NW3mPM3UX81trnjgTVGdDrqbpq8Qq', 
	`enabled`=TRUE,
	`beginn_arbeitverhaeltnis` = '1900-01-01',
	`ende_arbeitverhaeltnis`= '2500-01-01',
	`last_update` = CURDATE(),
	`version` = 0;
INSERT IGNORE INTO `tblmitarbeiter` 
	SET `username` = 'paulkunz', 
	`fullname` = 'Paul Kunz', 
	hersteller=FALSE,
	password = '$2a$10$VyNSiMVB5s8M2MEOm1Mh/el8NW3mPM3UX81trnjgTVGdDrqbpq8Qq', 
	`enabled`=TRUE,
	`beginn_arbeitverhaeltnis` = '1900-01-01',
	`ende_arbeitverhaeltnis`= '2500-01-01',
	`last_update` = CURDATE(),
	`version` = 0;
INSERT IGNORE INTO `tblmitarbeiter` 
	SET `username` = 'maryschmidt', 
	`fullname` = 'Mary Schmidt', 
	hersteller=FALSE,
	password = '$2a$10$VyNSiMVB5s8M2MEOm1Mh/el8NW3mPM3UX81trnjgTVGdDrqbpq8Qq', 
	`enabled`=TRUE,
	`beginn_arbeitverhaeltnis` = '1900-01-01',
	`ende_arbeitverhaeltnis`= '2500-01-01',
	`last_update` = CURDATE(),
	`version` = 0;



INSERT IGNORE INTO `tblmonteure_zeitmodelle` SET `beginn_gueltigkeit` = '2019-01-01', `mitarbeiter_username`='limago', `zeitmodell_id`='5c88d4c5-4c8a-45f6-85f0-170ff4112427';
INSERT IGNORE INTO `tblmonteure_zeitmodelle` SET `beginn_gueltigkeit` = '2019-01-01', `mitarbeiter_username`='peterhinz', `zeitmodell_id`='5c88d4c5-4c8a-45f6-85f0-170ff4112427';


DELETE FROM tblmitarbeiterrollen WHERE username = 'limago';
DELETE FROM tblmitarbeiterrollen WHERE username = 'peterhinz';
DELETE FROM tblmitarbeiterrollen WHERE username = 'paulkunz';
DELETE FROM tblmitarbeiterrollen WHERE username = 'maryschmidt';


INSERT IGNORE INTO `tblmitarbeiterrollen` SET `username` = 'limago', `rolle` = 'ADMIN';
INSERT IGNORE INTO `tblmitarbeiterrollen` SET `username` = 'limago', `rolle` = 'MANAGER';
INSERT IGNORE INTO `tblmitarbeiterrollen` SET `username` = 'limago', `rolle` = 'MEISTER';
INSERT IGNORE INTO `tblmitarbeiterrollen` SET `username` = 'limago', `rolle` = 'MONTEUR';

INSERT IGNORE INTO `tblmitarbeiterrollen` SET `username` = 'maryschmidt', `rolle` = 'MANAGER';
INSERT IGNORE INTO `tblmitarbeiterrollen` SET `username` = 'paulkunz', `rolle` = 'MEISTER';
INSERT IGNORE INTO `tblmitarbeiterrollen` SET `username` = 'peterhinz', `rolle` = 'MONTEUR';