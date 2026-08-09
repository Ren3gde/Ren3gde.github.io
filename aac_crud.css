# Example Python Code to Insert a Document 

from pymongo import MongoClient 
from bson.objectid import ObjectId 

class AnimalShelter(object): 
    """ CRUD operations for Animal collection in MongoDB """ 

    def __init__(self, username, password): 
        # Initializing the MongoClient. This helps to access the MongoDB 
        # databases and collections. This is hard-wired to use the aac 
        # database, the animals collection, and the aac user. 
        # 
        # You must edit the password below for your environment. 
        # 
        # Connection Variables 
        # 
        HOST = 'localhost' 
        PORT = 27017 
        DB = 'aac' 
        COL = 'animals' 
        # 
        # Initialize Connection 
        # 
        self.client = MongoClient('mongodb://%s:%s@%s:%d' % (username,password,HOST,PORT)) 
        self.database = self.client['%s' % (DB)] 
        self.collection = self.database['%s' % (COL)] 
    #
    # Create a method to return the next available record number for use in the create method
    # 
    def get_next_id(self):
        # Finds the highest animal_id and returns the next string id
        try:
            # Find the highest animal_id currently in the database
            # Only look for records that HAVE animal_id
            
            last_record = self.collection.find_one({"animal_id":{"$exists": True}}, sort=[("animal_id", -1)])
            
            if last_record and "animal_id" in last_record:
                
                # get the string
                current_id_str = last_record["animal_id"]
                
                # strip 'A' and convert rest to integer
                current_num = int(current_id_str.strip("A"))
                
                # increment and turn back into string with leading zeros
                #.zfill(6) ensures '7' becomes 000007 to keep correct format
                next_num_str = str(current_num + 1).zfill(6)
                
                return f"A{next_num_str}"
            else:
                # If the collection is empty start at a default
                return "A000001"
            
        except Exception as e:
            print(f"Error generating animal_id: {e}")
            return None            
    
    # Create method to implement the C in CRUD. 
    
    def create(self, data):

            try:
                self.collection.insert_one(data) # Data should be dictionary
                return True
            except Exception as e:
                # Handle insertion errors
                print(f"An error occurred: {e}")
                return False
            
            # Create method to implement the R in CRUD
            
    def read(self, query):
        
        if query is not None:
            
            data = self.collection.find(query)
            
            return list(data)  # Converts the cursor data to a list
        
        else:
            return []
        
        # Update method
                
    def update(self, query, data):
                    
        result = self.collection.update_many(query,{"$set": data})
            
        return result.modified_count   # Returns the number of records changed
    
        # Delete Method
                       
    def delete(self, query):
                
        result = self.collection.delete_many(query)
                
        return result.deleted_count
            