import csv

class TreeNode:
    def __init__(self, id, name, parent_id):
        self.id = id
        self.name = name
        self.parent_id = parent_id
        self.children = []

def build_tree(records):
    id_to_node = {}
    root = None

    for record in records:
        node = TreeNode(record['id'], record['nam'], record['parent_id'])
        id_to_node[node.id] = node

        if not node.parent_id:
            root = node
        else:
            parent = id_to_node.get(node.parent_id)
            if parent:
                parent.children.append(node)

    return root

def print_tree(node, is_leaf):
    print(f"{node.id},{node.name},{node.parent_id},{is_leaf}")

    for child in node.children:
        print_tree(child, not bool(child.children))

def main():
    with open('your_file.csv', 'r') as file:
        reader = csv.DictReader(file)
        records = list(reader)

    root = build_tree(records)
    print("id,nam,parent_id,is_leaf")
    print_tree(root, not bool(root.children))

if __name__ == "__main__":
    main()
