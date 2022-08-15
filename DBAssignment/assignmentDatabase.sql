CREATE or replace DATABASE shop;
USE shop;

CREATE OR REPLACE TABLE bundle (
	bundleID INT PRIMARY KEY NOT null,
	bundleName VARCHAR(25) NOT NULL, 
	price DECIMAL(6, 2)
);

CREATE OR REPLACE TABLE store (
	storeID INT PRIMARY KEY NOT null,
	address VARCHAR(50) NOT NULL
);

CREATE OR REPLACE TABLE employee (
	empID INT PRIMARY KEY NOT null,
	firstName VARCHAR(25) NOT NULL,
	lastName VARCHAR(25) NOT NULL,
	phone VARCHAR(15),
	address varchar(50),
	storeID INT,
	CONSTRAINT FK_employee_storeID FOREIGN KEY (storeID) REFERENCES store(storeID)
);

CREATE OR REPLACE TABLE product (
	productID INT NOT NULL PRIMARY KEY,
	productName varchar(25) NOT NULL,
	price DECIMAL(6, 2),
	company VARCHAR(25),
	qty INT DEFAULT 1 NOT NULL
);

CREATE OR REPLACE TABLE bundleProd (
	bundleID INT NOT NULL,
	productID INT NOT NULL,
	PRIMARY KEY (bundleID, productid),
	qty INT DEFAULT 1,
	CONSTRAINT fk_bundleProd_bundleID FOREIGN KEY (bundleID) REFERENCES bundle(bundleID),
	CONSTRAINT fk_bundleProd_productID FOREIGN KEY (productID) REFERENCES product(productID)
);

CREATE OR REPLACE TABLE material (
	materialID INT NOT NULL PRIMARY KEY,
	materialName VARCHAR(25) NOT null
);

CREATE OR REPLACE TABLE colour (
	colourID INT NOT NULL PRIMARY KEY,
	colourName VARCHAR(25) NOT NULL,
	colourHex VARCHAR(6) NOT null
);

CREATE OR REPLACE TABLE machinery (
	productID INT NOT NULL PRIMARY KEY,
	colourID INT,
	weight DECIMAL(3, 1),
	part VARCHAR(25),
	constraint fk_machinery_productID FOREIGN KEY (productID) REFERENCES product(productID),
	CONSTRAINT fk_machinery_colourID FOREIGN KEY (colourID) REFERENCES colour(colourID) 
);

CREATE OR REPLACE TABLE misc (
	productID INT NOT NULL PRIMARY KEY,
	colourID INT,
	materialID INT,
	CONSTRAINT fk_misc_productID FOREIGN KEY (productID) REFERENCES product (productID),
	CONSTRAINT fk_misc_colourID FOREIGN KEY (colourID) REFERENCES colour(colourID),
	CONSTRAINT fk_misc_materialID FOREIGN KEY (materialID) REFERENCES material(materialID)
);

CREATE OR REPLACE TABLE storage (
	productID INT NOT NULL PRIMARY KEY,
	colourID INT,
	size VARCHAR(10),
	materialID INT,
	CONSTRAINT fk_storage_productID FOREIGN KEY (productID) REFERENCES product (productID),
	CONSTRAINT fk_storage_colourID FOREIGN KEY (colourID) REFERENCES colour(colourID),
	CONSTRAINT fk_storage_materialID FOREIGN KEY (materialID) REFERENCES material(materialID)
);

CREATE OR REPLACE TABLE hoop (
	productID INT NOT NULL PRIMARY KEY,
	colourID INT,
	size VARCHAR(10),
	materialID INT,
	CONSTRAINT fk_hoop_productID FOREIGN KEY (productID) REFERENCES product (productID),
	CONSTRAINT fk_hoop_colourID FOREIGN KEY (colourID) REFERENCES colour(colourID),
	CONSTRAINT fk_hoop_materialID FOREIGN KEY (materialID) REFERENCES material(materialID)
);

CREATE OR REPLACE TABLE floss (
	productID INT NOT NULL PRIMARY KEY,
	colourID INT,
	LENGTH DECIMAL(4, 2),
	TYPE VARCHAR(10),
	materialID INT,
	CONSTRAINT fk_floss_productID FOREIGN KEY (productID) REFERENCES product (productID),
	CONSTRAINT fk_floss_colourID FOREIGN KEY (colourID) REFERENCES colour(colourID),
	CONSTRAINT fk_floss_materialID FOREIGN KEY (materialID) REFERENCES material(materialID)
);

CREATE OR REPLACE TABLE inventory (
	productID INT NOT NULL,
	storeID INT NOT NULL,
	PRIMARY KEY(productID, storeID),
	CONSTRAINT fk_inventory_productID FOREIGN KEY (productID) REFERENCES product(productID),
	CONSTRAINT fk_inventory_storeID FOREIGN KEY (storeID) REFERENCES store(storeID),
	qty INT DEFAULT 0 NOT null
);