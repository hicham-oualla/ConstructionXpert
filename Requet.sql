CREATE TABLE Project (
    id_project SERIAL PRIMARY KEY,
    nom VARCHAR(255) NOT NULL,
    description TEXT,
    dateDebut DATE,
    dateFin DATE,
    budget DOUBLE PRECISION
);
