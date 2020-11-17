CREATE TABLE users (
	id SERIAL NOT NULL,
    email VARCHAR (32) NOT NULL,
    password VARCHAR (32) NOT NULL,
    firstName VARCHAR (32) NOT NULL,
    lastName VARCHAR (32) NOT NULL,
    type VARCHAR (32) NOT NULL,
    avatar VARCHAR (256) NULL,
    level INTEGER NOT NULL,
    
	PRIMARY KEY (id)
);

CREATE TABLE tasks (
	id SERIAL NOT NULL,
    task VARCHAR (256) NOT NULL,
    points INTEGER NOT NULL,
    description VARCHAR (1028) NULL,
    
	PRIMARY KEY (id)
);

CREATE TABLE studentTasks (
	id SERIAL NOT NULL,
    userId BIGINT UNSIGNED,
    taskId BIGINT UNSIGNED,
    date DATETIME NOT NULL,
    notes VARCHAR (1028) NULL,
    
	PRIMARY KEY (id),
    CONSTRAINT FK_userTask FOREIGN KEY (userId) REFERENCES users(id),
    CONSTRAINT FK_taskTask FOREIGN KEY (taskId) REFERENCES tasks(id)
);

CREATE TABLE rewards (
	id SERIAL NOT NULL,
    reward VARCHAR (256) NOT NULL,
    description INTEGER NOT NULL,
    
	PRIMARY KEY (id)
);

CREATE TABLE studentRewards (
	id SERIAL NOT NULL,
    userId BIGINT UNSIGNED,
    rewardId BIGINT UNSIGNED,
    date DATETIME NOT NULL,
    notes VARCHAR (1028) NULL,
    
	PRIMARY KEY (id),
    CONSTRAINT FK_userReward FOREIGN KEY (userId) REFERENCES users(id),
    CONSTRAINT FK_rewardReward FOREIGN KEY (rewardId) REFERENCES rewards(id)
);