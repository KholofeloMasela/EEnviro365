DROP TABLE IF EXISTS Pet;

CREATE TABLE Pet(
    id INT AUTO_INCREMENT PRIMARY KEY,
    pet_type VARCHAR(250) NOT NULL,
    pet_name VARCHAR(250) NOT NULL
    );

INSERT INTO Pet(pet_type, pet_name) VALUES
    ('Cat', 'Tom'),
    ('Dog', 'Cooper'),
    ('Bird', 'Millie'),
    ('Fish', 'Max'),
    ('Hamster', 'Molly');