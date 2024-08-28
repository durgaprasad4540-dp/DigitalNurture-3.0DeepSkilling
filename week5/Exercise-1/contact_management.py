

def read_contacts(file_name):
    try:
        with open(file_name, 'r') as file:
            contacts = file.readlines()
        return [contact.strip() for contact in contacts]
    except FileNotFoundError:
        print(f"Error: The file '{file_name}' does not exist.")
        return []

def write_contacts(file_name, contacts):
    try:
        with open(file_name, 'w') as file:
            for contact in contacts:
                file.write(f"{contact}\n")
    except IOError as e:
        print(f"Error writing to file '{file_name}': {e}")

def add_contact(file_name, contact):
    contacts = read_contacts(file_name)
    contacts.append(contact)
    write_contacts(file_name, contacts)

def remove_contact(file_name, contact):
    contacts = read_contacts(file_name)
    if contact in contacts:
        contacts.remove(contact)
        write_contacts(file_name, contacts)
    else:
        print(f"Contact '{contact}' not found.")
        
def display_contacts(file_name):
    contacts = read_contacts(file_name)
    if contacts:
        print("Contacts:")
        for contact in contacts:
            print(contact)
    else:
        print("No contacts found.")


import pickle

def save_contacts_binary(file_name, contacts):
    try:
        with open(file_name, 'wb') as file:
            pickle.dump(contacts, file)
    except IOError as e:
        print(f"Error writing to file '{file_name}': {e}")

def load_contacts_binary(file_name):
    try:
        with open(file_name, 'rb') as file:
            contacts = pickle.load(file)
        return contacts
    except FileNotFoundError:
        print(f"Error: The file '{file_name}' does not exist.")
        return []
    except pickle.PickleError as e:
        print(f"Error loading from file '{file_name}': {e}")
        return []


def main():
    file_name = 'contacts.txt'
    binary_file_name = 'contacts.dat'
    
    while True:
        print("\n1. Add Contact")
        print("2. Remove Contact")
        print("3. Display Contacts (Text File)")
        print("4. Save Contacts (Binary File)")
        print("5. Load Contacts (Binary File)")
        print("6. Exit")
        choice = input("Enter your choice: ")
        
        if choice == '1':
            contact = input("Enter contact name to add: ")
            add_contact(file_name, contact)
        elif choice == '2':
            contact = input("Enter contact name to remove: ")
            remove_contact(file_name, contact)
        elif choice == '3':
            display_contacts(file_name)
        elif choice == '4':
            contacts = read_contacts(file_name)
            save_contacts_binary(binary_file_name, contacts)
        elif choice == '5':
            contacts = load_contacts_binary(binary_file_name)
            print("Contacts from binary file:")
            for contact in contacts:
                print(contact)
        elif choice == '6':
            break
        else:
            print("Invalid choice. Please try again.")

if __name__ == "__main__":
    main()
