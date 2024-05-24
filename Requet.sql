CREATE TABLE Project (
    id_project SERIAL PRIMARY KEY,
    nom VARCHAR(255) NOT NULL,
    description TEXT,
    dateDebut DATE,
    dateFin DATE,
    budget DOUBLE PRECISION
);
CREATE TABLE taches (
    id_tach SERIAL PRIMARY KEY,
    id_project INT REFERENCES project(id_project) ,
    T_nom VARCHAR(255),
    T_description TEXT,
    T_datedebut DATE,
    Tdatefin DATE,
    statut VARCHAR(50)
   
);
